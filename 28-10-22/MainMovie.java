package HandsOn_Lab;
/*
 * Problem 2
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables

 */
class movie{
	String movieName,starttime,endtime;
	void setMovie(String mname,String stime,String endtime){
		movieName=mname;
		starttime=stime;
		this.endtime=endtime;
	}
	void getMovie(){
		System.out.println("MovieName="+movieName+" \nStart time="+starttime+" \nEndtime="+endtime);
	}
}
public class MainMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie movie=new movie();
		movie.setMovie("Avengers", "10:35am", "12:00am");
		movie.getMovie();
	}

}
