package com.hackerrank.practice;

import java.io.IOException;
import java.util.Scanner;
public class AVeryBigSum {

        // Complete the aVeryBigSum function below.
        static long aVeryBigSum(long[] ar) {
            //long a = Arrays.stream(ar).sum();
            long a = 0l;
            for(int i=0; i<ar.length; i++) {
                a = a+ar[i];
                System.out.println("Elements at pos"+i+" are "+ar[i] );
            }
            return a;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

            long[] ar = {1000000001,1000000002,1000000003,1000000004,1000000005};
            long result = aVeryBigSum(ar);

            System.out.println("******** "+result);
        }
    }


