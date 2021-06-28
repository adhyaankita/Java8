package com.IO.fileAverage;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, InstantiationException {
        try {
            String pathOfSrcFile = "C:\\Users\\eankadh\\IdeaProjects\\JavaAdvancedProject\\src\\com\\IO\\fileAverage\\salary.txt";
            List<Salary> salaryList = readFile(pathOfSrcFile);

            Map<String, List<Integer>> deptWithSalary = groupByDepartment(salaryList);
            Map<String, List<Salary>> dept = groupBy(salaryList, "deptName", Salary.class);


            Map<String, Double> avgSalary = findAvgSalary(deptWithSalary);

            String pathOfDestFile = "C:\\Users\\eankadh\\IdeaProjects\\JavaAdvancedProject\\src\\com\\IO\\fileAverage\\avg_salary.csv";
            writeFile(avgSalary, pathOfDestFile);
        }catch (FileNotFoundException | NoSuchMethodException e){
            System.out.println("File not found in the Path given");
        }
    }

    private static void writeFile(Map<String, Double> avgSalary, String pathOfDestFile) throws IOException{
        Set<String> setOfKeys = avgSalary.keySet();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(pathOfDestFile))){
            String fullRecord = "DEPT_NAME,AVG_SALARY\n";
            for (String key: setOfKeys) {
                fullRecord += key+","+avgSalary.get(key) + "\n";
            }
            writer.write(fullRecord);
        }

    }

    private static Map<String, Double> findAvgSalary(Map<String, List<Integer>> deptWithSalary) {
        Map<String,Double> avgSalaryRec = new HashMap<>();
        Set<String> setOfKeys = deptWithSalary.keySet();
        for (String key: setOfKeys) {
            List<Integer> values = deptWithSalary.get(key);
            double avg = getAverage(values);
            avgSalaryRec.put(key,avg);
        }
        return avgSalaryRec;
    }

    private static double getAverage(List<Integer> values) {
        int sum=0;
        for (Integer value:values) {
            sum += value;
        }
        return (sum/values.size());
    }

    private static Map<String, List<Integer>> groupByDepartment(List<Salary> salaryList) {
        Map<String,List<Integer>> groupByDeptRec = new HashMap<>();
        for (Salary salary:salaryList) {

            String key = salary.getDeptName();
            int value = salary.getSalary();

            if(!groupByDeptRec.containsKey(key)){
                List<Integer> listOfValues = new ArrayList<>();
                listOfValues.add(value);
                groupByDeptRec.put(key,listOfValues);
            }
            else
            {
                List<Integer> listOfValues = groupByDeptRec.get(key);
                listOfValues.add(value);
                groupByDeptRec.put(key,listOfValues);
            }
        }
        return groupByDeptRec;
    }

    private static List<Salary> readFile(String pathOfSrcFile) throws IOException  {
        List<Salary> salaryList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(pathOfSrcFile))){
            reader.readLine(); //to skip header
            String row;
            while ((row = reader.readLine()) != null){
                Salary salary = new Salary();
                String[] record = row.split("\\|");
                salary.setId(Integer.parseInt(record[0]));
                salary.setDeptName(record[1]);
                salary.setSalary(Integer.parseInt(record[2]));
                salaryList.add(salary);
            }
        }
        return salaryList;
    }

    private static <T> Map<String,List<T>> groupBy(List<T> tList, String key, Class<?> clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        String methodName = "get" + key.substring(0, 1).toUpperCase() + key.substring(1);
        Method method = clazz.getMethod(methodName);
        Map<String, List<T>> map = new HashMap<>();
        for(T value: tList) {
            String keyValue = (String) method.invoke(value);
            if(!map.containsKey(keyValue)){
                List<T> list = new ArrayList<>();
                list.add(value);
                map.put(keyValue, list);
            } else {
                List<T> list = map.get(keyValue);
                list.add(value);
                map.put(keyValue, list);
            }

        }
        return map;
    }
}