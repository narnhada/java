package Day6;

import java.util.Calendar;
//import java.util.Scanner;


public class VarTest0424_toMonthCalendar {
    public static void main(String[] args) {
       
       
        Calendar cal = Calendar.getInstance(); //캘린더 인스턴스 얻기
       
        int today = cal.get(Calendar.DATE); //오늘 일자 저장  
       
       
        /*Scanner scn = new Scanner(System.in);
        System.out.println("년도를 입력하세요");
        int inputYear = scn.nextInt();
        System.out.println("월을 입력하세요");
        int inputMonth = scn.nextInt();*/
               
       
        //원하는 년도 날짜 세팅
        //cal.set(Calendar.YEAR, inputYear);
        //cal.set(Calendar.MONTH, inputMonth-1);
       
       
        cal.set(Calendar.DATE,1); //현재 달을 1일로 설정.
        int sDayNum = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일 얻어오기, SUNDAY (1) .MONDAY(2) , TUESDAY(3),.....
        int endDate = cal.getActualMaximum(Calendar.DATE); //달의 마지막일 얻기
       
        //콘솔 출력
        //System.out.println("startDATE="+cal.get(Calendar.DATE));
        //System.out.println("sDayNum="+sDayNum);
        //System.out.println("endDate="+endDate);
       
       
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);
       
       
        System.out.println("===================== "+ nowYear+"년  " + (nowMonth+1) + "월 ==================");

        int sDay = sDayNum;
       
        //요일명 출력
        System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토\t");  
        System.out.println("====================================================");
        //1일이 시작되는 이전의 요일 공백으로 채우기
        for (int i=1; i<sDayNum;i++){
            System.out.printf("%3s\t"," ");  
        }//for-----------------
        for (int i = 1; i <= endDate ; i++) {   // 1부터 마지막일까지 반복.        
           
            if(i==today) System.out.printf("[%2d]\t",i); //오늘 날짜 표시
            else System.out.printf("%3d\t",i); //일반 출력
                   
            if(sDay%7==0) System.out.println(); // 요일이 7배수가 되면 줄바꿈.
            sDay++; //요일 카운트
        }//for-----------------          
    }//main()
}