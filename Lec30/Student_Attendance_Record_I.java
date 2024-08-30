package Lec30;
public class Student_Attendance_Record_I {
    public static void main(String[] args) {
        String s="PPALLP";
        System.out.println(checkRecord(s));
    }
        public static boolean checkRecord(String s) {
            int Absent=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'){
                    Absent++;
                }
                if(s.charAt(i)=='L' && i<s.length()-2){
                    if(s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
                        return false;
                    }
                }
            }
            if(Absent>1){
                return false;
            }
            return true;
        }
    }