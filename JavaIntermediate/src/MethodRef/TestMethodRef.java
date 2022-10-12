package MethodRef;

public class TestMethodRef {
	
	public static void main(String[] args) {
		School sch=new School();
		Noteable nt=sch::noteLecture;
		nt.note("Lecture name");
		
		Noteable nt1=sch::noteObservation;
		nt1.note("Class objectives");
		
		Noteable nt2=sch::noteOnlineClass;
		nt2.note("What you learn");
		
		School mySchool=new School();
		mySchool.noteLecture("lecture2");
		mySchool.noteObservation("lecture");
		mySchool.noteOnlineClass("lecture");
	}

}
