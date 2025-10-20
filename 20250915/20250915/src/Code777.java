class Sj {
	int kor;
	int eng;
	int mat;
	int tot;
	float avg;
	public Sj(int i, int j, int k) {
		this.kor = i;
		this.eng = j;
		this.mat = k;
		
		tot = kor + eng + mat;
		avg = tot / (float)3;
	}
	public void disp() {
		System.out.println(this.tot);
		System.out.println(this.avg);
	}
}

public class Code777 {

	public static void main(String[] args) {
		Sj s1 = new Sj(91, 88, 75);
		Sj s2 = new Sj(11, 18, 15);
		Sj s3 = new Sj(68, 58, 77);
		
		s1.disp();
		s2.disp();
		s3.disp();
		
//		s1.kor = 91;
//		s1.eng = 88;
//		s1.mat = 75;
//		s1.tot = s1.kor + s1.eng + s1.mat;
//		s1.avg = s1.tot / (float)3;
//		System.out.println(s1.kor);
//		System.out.println(s1.eng);
//		System.out.println(s1.mat);
//		System.out.println(s1.tot);
//		System.out.println(s1.avg);
		
//		s2.kor = 11;
//		s2.eng = 18;
//		s2.mat = 15;
//		s2.tot = s2.kor + s2.eng + s2.mat;
//		s2.avg = s2.tot / (float)3;
//		System.out.println(s2.kor);
//		System.out.println(s2.eng);
//		System.out.println(s2.mat);
//		System.out.println(s2.tot);
//		System.out.println(s2.avg);

//		s3.kor = 68;
//		s3.eng = 58;
//		s3.mat = 77;
//		s3.tot = s3.kor + s3.eng + s3.mat;
//		s3.avg = s3.tot / (float)3;
//		System.out.println(s3.kor);
//		System.out.println(s3.eng);
//		System.out.println(s3.mat);
//		System.out.println(s3.tot);
//		System.out.println(s3.avg);

	}

}
