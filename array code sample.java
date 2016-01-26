package com.sunmeat;

public class Program {

    public static void main(String[] args) {

        int size = 10;
        int[] ar = new int[size];

        // ���������� ������� ������
        for (int i = 0; i < ar.length; i++)
            ar[i] = i + 1;

        // �������� �������� � �������� �������
        for (int i = ar.length - 1; i >= 0; i--)
            System.out.print(ar[i] + " ");
        System.out.println();

        // �������� ������ ������ ��������
        for (int i = 0; i < ar.length; i++)
            if (ar[i] % 2 == 0)
                System.out.print(ar[i] + " ");
        System.out.println();

        // ����� ������������ ��������
        int min = ar[0];
        for (int i = 1; i < ar.length; i++)
            if (ar[i] < min)
                min = ar[i];
        System.out.println(min);

        // ����� ������������� ��������
        // ... ����������

        // ���������� �������� ���������������
        double sum = 0;
        for (int i = 0; i < ar.length; i++)
            sum += ar[i];
        double avg = sum / ar.length;
        System.out.println(avg);

        // �������� �������
        for (int i = 0, j = ar.length - 1; i < ar.length / 2; i++, j--) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
        for (int i = 0; i < size; i++)
            System.out.print(ar[i] + "  ");
        System.out.println();

    }
}








