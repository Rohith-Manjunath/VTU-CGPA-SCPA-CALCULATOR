package my_java_projects;

import java.util.Scanner;
class sgpa {
	
	void third_sem_or_fouth_sem(){
		int a,b,c,d,e,f,g,h,i;
		int ca=3,cb=4,cc=3,cd=3,ce=3,cf=3,cg=2,ch=2,ci=1;
		double ga = 0,gb=0,gc=0,gd=0,ge=0,gf=0,gg=0,gh=0,gi=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 18MAT31/41:");
		a=s.nextInt();
		
		if(a<40) {
			
			ga=0;
		}
	else if(a>=45&&a<60) {
		ga=6;
	}

	else if(a>=40&&a<45) {
		ga=4;
	}

	else if(a>=60&&a<100) {
		ga=Math.ceil(a/10+1);
	}
		
		System.out.println(ga);
		
		System.out.println("Enter 18XX32/42:");
	b=s.nextInt();

	if(b<40) {

	gb=0;
	}
	else if(b>=45&&b<60) {
	gb=6;
	}

	else if(b>=40&&b<45) {
	gb=4;
	}

	else if(b>=60&&b<100) {
	gb=Math.ceil(b/10+1);
	}

	System.out.println(gb);

	System.out.println("Enter 18XX33/43:");
	c=s.nextInt();

	if(c<40) {

	gc=0;
	}
	else if(c>=45&&c<60) {
	gc=6;
	}

	else if(c>=40&&c<45) {
	gc=4;
	}

	else if(c>=60&&c<100) {
	gc=Math.ceil(c/10+1);
	}

	System.out.println(gc);

	System.out.println("Enter 18XX34/44:");
	d=s.nextInt();

	if(d<40) {

	gd=0;
	}
	else if(d>=45&&d<60) {
	gd=6;
	}

	else if(d>=40&&d<45) {
	gd=4;
	}

	else if(d>=60&&d<100) {
	gd=Math.ceil(d/10+1);
	}

	System.out.println(gd);

	System.out.println("Enter 18XX35/45:");
	e=s.nextInt();

	if(e<40) {

	ge=0;
	}
	else if(e>=45&&e<60) {
	ge=6;
	}

	else if(e>=40&&e<45) {
	ge=4;
	}

	else if(e>=60&&e<100) {
	ge=Math.ceil(e/10+1);
	}

	System.out.println(ge);

	System.out.println("Enter 18XX36/46:");
	f=s.nextInt();

	if(f<40) {

	gf=0;
	}
	else if(f>=45&&f<60) {
	gf=6;
	}

	else if(f>=40&&f<45) {
	gf=4;
	}

	else if(f>=60&&f<100) {
	gf=Math.ceil(f/10+1);
	}

	System.out.println(gf);

	System.out.println("Enter 18XXL37/47:");
	g=s.nextInt();

	if(g<40) {

	gg=0;
	}
	else if(g>=45&&g<60) {
	gg=6;
	}

	else if(g>=40&&g<45) {
	gg=4;
	}

	else if(g>=60&&g<100) {
	gg=Math.ceil(g/10+1);
	}

	System.out.println(gg);

	System.out.println("Enter 18XXL38/48:");
	h=s.nextInt();

	if(h<40) {

	gh=0;
	}
	else if(h>=45&&h<60) {
	gh=6;
	}

	else if(h>=40&&h<45) {
	gh=4;
	}

	else if(h>=60&&h<100) {
	gh=Math.ceil(h/10+1);
	}

	System.out.println(gh);

	System.out.println("Enter 18CPC39/49 or Kannada:");
	i=s.nextInt();

	if(i<40) {

	gi=0;
	}
	else if(i>=45&&i<60) {
	gi=6;
	}

	else if(i>=40&&i<45) {
	gi=4;
	}

	else if(i>=60&&i<100) {
	gi=Math.ceil(i/10+1);
	}

	System.out.println(gi);


	double sgpa=((ga*ca)+(gb*cb)+(gc*cc)+(gd*cd)+(ge*ce)+(gf*cf)+(gg*cg)+(gh*ch)+(gi*ci))/24;

	double percentage=(sgpa-0.75)*10;
	System.out.println(" Third sem SGPA is : "+sgpa);
	System.out.println("Third sem Percentage is: "+percentage+" %");
	}
	
	void chemistry_cycle(){
		int a,b,c,d,e,f,g,h;
		int ca=4,cb=4,cc=3,cd=3,ce=3,cf=1,cg=1,ch=1;
		double ga = 0,gb=0,gc=0,gd=0,ge=0,gf=0,gg=0,gh=0;
		System.out.println("Hey");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 18MAT11/21:");
		a=s.nextInt();
		
		if(a<40) {
			
			ga=0;
		}
	else if(a>=45&&a<60) {
		ga=6;
	}

	else if(a>=40&&a<45) {
		ga=4;
	}

	else if(a>=60&&a<100) {
		ga=Math.ceil(a/10+1);
	}
		
		System.out.println(ga);
		
		System.out.println("Enter 18CHE12/22:");
	b=s.nextInt();

	if(b<40) {

	gb=0;
	}
	else if(b>=45&&b<60) {
	gb=6;
	}

	else if(b>=40&&b<45) {
	gb=4;
	}

	else if(b>=60&&b<100) {
	gb=Math.ceil(b/10+1);
	}

	System.out.println(gb);

	System.out.println("Enter 18CPS13/23:");
	c=s.nextInt();

	if(c<40) {

	gc=0;
	}
	else if(c>=45&&c<60) {
	gc=6;
	}

	else if(c>=40&&c<45) {
	gc=4;
	}

	else if(c>=60&&c<100) {
	gc=Math.ceil(c/10+1);
	}

	System.out.println(gc);

	System.out.println("Enter 18ELN14/24:");
	d=s.nextInt();

	if(d<40) {

	gd=0;
	}
	else if(d>=45&&d<60) {
	gd=6;
	}

	else if(d>=40&&d<45) {
	gd=4;
	}

	else if(d>=60&&d<100) {
	gd=Math.ceil(d/10+1);
	}

	System.out.println(gd);

	System.out.println("Enter 18ME15/25:");
	e=s.nextInt();

	if(e<40) {

	ge=0;
	}
	else if(e>=45&&e<60) {
	ge=6;
	}

	else if(e>=40&&e<45) {
	ge=4;
	}

	else if(e>=60&&e<100) {
	ge=Math.ceil(e/10+1);
	}

	System.out.println(ge);

	System.out.println("Enter 18CHE16/26:");
	f=s.nextInt();

	if(f<40) {

	gf=0;
	}
	else if(f>=45&&f<60) {
	gf=6;
	}

	else if(f>=40&&f<45) {
	gf=4;
	}

	else if(f>=60&&f<100) {
	gf=Math.ceil(f/10+1);
	}

	System.out.println(gf);

	System.out.println("Enter 18CPL17/27:");
	g=s.nextInt();

	if(g<40) {

	gg=0;
	}
	else if(g>=45&&g<60) {
	gg=6;
	}

	else if(g>=40&&g<45) {
	gg=4;
	}

	else if(g>=60&&g<100) {
	gg=Math.ceil(g/10+1);
	}

	System.out.println(gg);

	System.out.println("Enter 18EGH18/28(English):");
	h=s.nextInt();

	if(h<40) {

	gh=0;
	}
	else if(h>=45&&h<60) {
	gh=6;
	}

	else if(h>=40&&h<45) {
	gh=4;
	}

	else if(h>=60&&h<100) {
	gh=Math.ceil(h/10+1);
	}

	System.out.println(gh);


	double sgpa=((ga*ca)+(gb*cb)+(gc*cc)+(gd*cd)+(ge*ce)+(gf*cf)+(gg*cg)+(gh*ch))/20;

	double percentage=(sgpa-0.75)*10;
	System.out.println("Chemistry Cycle SGPA is : "+sgpa);
	System.out.println("Chemistry Cycle Percentage is: "+percentage+" %");
	}
	
	void physics_cycle(){
		int a,b,c,d,e,f,g,h;
		int ca=4,cb=4,cc=3,cd=3,ce=3,cf=1,cg=1,ch=1;
		double ga = 0,gb=0,gc=0,gd=0,ge=0,gf=0,gg=0,gh=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 18MAT11/21:");
		a=s.nextInt();
		
		if(a<40) {
			
			ga=0;
		}
	else if(a>=45&&a<60) {
		ga=6;
	}

	else if(a>=40&&a<45) {
		ga=4;
	}

	else if(a>=60&&a<100) {
		ga=Math.ceil(a/10+1);
	}
		
		System.out.println(ga);
		
		System.out.println("Enter 18PHY12/22:");
	b=s.nextInt();

	if(b<40) {

	gb=0;
	}
	else if(b>=45&&b<60) {
	gb=6;
	}

	else if(b>=40&&b<45) {
	gb=4;
	}

	else if(b>=60&&b<100) {
	gb=Math.ceil(b/10+1);
	}

	System.out.println(gb);

	System.out.println("Enter 18ELE13/23:");
	c=s.nextInt();

	if(c<40) {

	gc=0;
	}
	else if(c>=45&&c<60) {
	gc=6;
	}

	else if(c>=40&&c<45) {
	gc=4;
	}

	else if(c>=60&&c<100) {
	gc=Math.ceil(c/10+1);
	}

	System.out.println(gc);

	System.out.println("Enter 18CIV14/24:");
	d=s.nextInt();

	if(d<40) {

	gd=0;
	}
	else if(d>=45&&d<60) {
	gd=6;
	}

	else if(d>=40&&d<45) {
	gd=4;
	}

	else if(d>=60&&d<100) {
	gd=Math.ceil(d/10+1);
	}

	System.out.println(gd);

	System.out.println("Enter 18EGDL15/25:");
	e=s.nextInt();

	if(e<40) {

	ge=0;
	}
	else if(e>=45&&e<60) {
	ge=6;
	}

	else if(e>=40&&e<45) {
	ge=4;
	}

	else if(e>=60&&e<100) {
	ge=Math.ceil(e/10+1);
	}

	System.out.println(ge);

	System.out.println("Enter 18PHY16/26:");
	f=s.nextInt();

	if(f<40) {

	gf=0;
	}
	else if(f>=45&&f<60) {
	gf=6;
	}

	else if(f>=40&&f<45) {
	gf=4;
	}

	else if(f>=60&&f<100) {
	gf=Math.ceil(f/10+1);
	}

	System.out.println(gf);

	System.out.println("Enter 18ELE17/27:");
	g=s.nextInt();

	if(g<40) {

	gg=0;
	}
	else if(g>=45&&g<60) {
	gg=6;
	}

	else if(g>=40&&g<45) {
	gg=4;
	}

	else if(g>=60&&g<100) {
	gg=Math.ceil(g/10+1);
	}

	System.out.println(gg);

	System.out.println("Enter 18EGH18/28(English):");
	h=s.nextInt();

	if(h<40) {

	gh=0;
	}
	else if(h>=45&&h<60) {
	gh=6;
	}

	else if(h>=40&&h<45) {
	gh=4;
	}

	else if(h>=60&&h<100) {
	gh=Math.ceil(h/10+1);
	}

	System.out.println(gh);


	double sgpa=((ga*ca)+(gb*cb)+(gc*cc)+(gd*cd)+(ge*ce)+(gf*cf)+(gg*cg)+(gh*ch))/20;

	double percentage=(sgpa-0.75)*10;
	System.out.println("Physics Cycle SGPA is : "+sgpa);
	System.out.println("Physics Cycle Percentage is: "+percentage+" %");
	}
	
	void fifth_sem() {
		int a,b,c,d,e,f,g,h,i;
		int ca=3,cb=4,cc=4,cd=3,ce=3,cf=3,cg=2,ch=2,ci=1;
		double ga = 0,gb=0,gc=0,gd=0,ge=0,gf=0,gg=0,gh=0,gi=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 18XX51:");
		a=s.nextInt();
		
		if(a<40) {
			
			ga=0;
		}
	else if(a>=45&&a<60) {
		ga=6;
	}

	else if(a>=40&&a<45) {
		ga=4;
	}

	else if(a>=60&&a<100) {
		ga=Math.ceil(a/10+1);
	}
		
		System.out.println(ga);
		
		System.out.println("Enter 18XX52:");
	b=s.nextInt();

	if(b<40) {

	gb=0;
	}
	else if(b>=45&&b<60) {
	gb=6;
	}

	else if(b>=40&&b<45) {
	gb=4;
	}

	else if(b>=60&&b<100) {
	gb=Math.ceil(b/10+1);
	}

	System.out.println(gb);

	System.out.println("Enter 18XX53:");
	c=s.nextInt();

	if(c<40) {

	gc=0;
	}
	else if(c>=45&&c<60) {
	gc=6;
	}

	else if(c>=40&&c<45) {
	gc=4;
	}

	else if(c>=60&&c<100) {
	gc=Math.ceil(c/10+1);
	}

	System.out.println(gc);

	System.out.println("Enter 18XX54:");
	d=s.nextInt();

	if(d<40) {

	gd=0;
	}
	else if(d>=45&&d<60) {
	gd=6;
	}

	else if(d>=40&&d<45) {
	gd=4;
	}

	else if(d>=60&&d<100) {
	gd=Math.ceil(d/10+1);
	}

	System.out.println(gd);

	System.out.println("Enter 18XX55:");
	e=s.nextInt();

	if(e<40) {

	ge=0;
	}
	else if(e>=45&&e<60) {
	ge=6;
	}

	else if(e>=40&&e<45) {
	ge=4;
	}

	else if(e>=60&&e<100) {
	ge=Math.ceil(e/10+1);
	}

	System.out.println(ge);

	System.out.println("Enter 18XX56:");
	f=s.nextInt();

	if(f<40) {

	gf=0;
	}
	else if(f>=45&&f<60) {
	gf=6;
	}

	else if(f>=40&&f<45) {
	gf=4;
	}

	else if(f>=60&&f<100) {
	gf=Math.ceil(f/10+1);
	}

	System.out.println(gf);

	System.out.println("Enter 18XXL57 Lab-1:");
	g=s.nextInt();

	if(g<40) {

	gg=0;
	}
	else if(g>=45&&g<60) {
	gg=6;
	}

	else if(g>=40&&g<45) {
	gg=4;
	}

	else if(g>=60&&g<100) {
	gg=Math.ceil(g/10+1);
	}

	System.out.println(gg);

	System.out.println("Enter 18XXL58 Lab-2:");
	h=s.nextInt();

	if(h<40) {

	gh=0;
	}
	else if(h>=45&&h<60) {
	gh=6;
	}

	else if(h>=40&&h<45) {
	gh=4;
	}

	else if(h>=60&&h<100) {
	gh=Math.ceil(h/10+1);
	}

	System.out.println(gh);

	System.out.println("Enter Environmental studies:");
	i=s.nextInt();

	if(i<40) {

	gi=0;
	}
	else if(i>=45&&i<60) {
	gi=6;
	}

	else if(i>=40&&i<45) {
	gi=4;
	}

	else if(i>=60&&i<100) {
	gi=Math.ceil(i/10+1);
	}

	System.out.println(gi);


	double sgpa=((ga*ca)+(gb*cb)+(gc*cc)+(gd*cd)+(ge*ce)+(gf*cf)+(gg*cg)+(gh*ch)+(gi*ci))/25;

	double percentage=(sgpa-0.75)*10;
	System.out.println("Fifth Sem SGPA is : "+sgpa);
	System.out.println("Fifth Sem Percentage is: "+percentage+" %");
	}
	
	void sixth_sem(){
		int a,b,c,d,e,f,g,h;
		int ca=4,cb=4,cc=4,cd=3,ce=3,cf=2,cg=2,ch=2;
		double ga = 0,gb=0,gc=0,gd=0,ge=0,gf=0,gg=0,gh=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 18XX61:");
		a=s.nextInt();
		
		if(a<40) {
			
			ga=0;
		}
	else if(a>=45&&a<60) {
		ga=6;
	}

	else if(a>=40&&a<45) {
		ga=4;
	}

	else if(a>=60&&a<100) {
		ga=Math.ceil(a/10+1);
	}
		
		System.out.println(ga);
		
		System.out.println("Enter 18XX62:");
	b=s.nextInt();

	if(b<40) {

	gb=0;
	}
	else if(b>=45&&b<60) {
	gb=6;
	}

	else if(b>=40&&b<45) {
	gb=4;
	}

	else if(b>=60&&b<100) {
	gb=Math.ceil(b/10+1);
	}

	System.out.println(gb);

	System.out.println("Enter 18XX63:");
	c=s.nextInt();

	if(c<40) {

	gc=0;
	}
	else if(c>=45&&c<60) {
	gc=6;
	}

	else if(c>=40&&c<45) {
	gc=4;
	}

	else if(c>=60&&c<100) {
	gc=Math.ceil(c/10+1);
	}

	System.out.println(gc);

	System.out.println("Enter 18XX64X:");
	d=s.nextInt();

	if(d<40) {

	gd=0;
	}
	else if(d>=45&&d<60) {
	gd=6;
	}

	else if(d>=40&&d<45) {
	gd=4;
	}

	else if(d>=60&&d<100) {
	gd=Math.ceil(d/10+1);
	}

	System.out.println(gd);

	System.out.println("Enter 18XX65X:");
	e=s.nextInt();

	if(e<40) {

	ge=0;
	}
	else if(e>=45&&e<60) {
	ge=6;
	}

	else if(e>=40&&e<45) {
	ge=4;
	}

	else if(e>=60&&e<100) {
	ge=Math.ceil(e/10+1);
	}

	System.out.println(ge);

	System.out.println("Enter 18XXL66 Lab-1:");
	f=s.nextInt();

	if(f<40) {

	gf=0;
	}
	else if(f>=45&&f<60) {
	gf=6;
	}

	else if(f>=40&&f<45) {
	gf=4;
	}

	else if(f>=60&&f<100) {
	gf=Math.ceil(f/10+1);
	}

	System.out.println(gf);

	System.out.println("Enter 18XXL67 Lab-2:");
	g=s.nextInt();

	if(g<40) {

	gg=0;
	}
	else if(g>=45&&g<60) {
	gg=6;
	}

	else if(g>=40&&g<45) {
	gg=4;
	}

	else if(g>=60&&g<100) {
	gg=Math.ceil(g/10+1);
	}

	System.out.println(gg);

	System.out.println("Enter 18XXMP68 Mini-Project:");
	h=s.nextInt();

	if(h<40) {

	gh=0;
	}
	else if(h>=45&&h<60) {
	gh=6;
	}

	else if(h>=40&&h<45) {
	gh=4;
	}

	else if(h>=60&&h<100) {
	gh=Math.ceil(h/10+1);
	}

	System.out.println(gh);


	double sgpa=((ga*ca)+(gb*cb)+(gc*cc)+(gd*cd)+(ge*ce)+(gf*cf)+(gg*cg)+(gh*ch))/24;

	double percentage=(sgpa-0.75)*10;
	System.out.println("Sixth Sem SGPA is : "+sgpa);
	System.out.println("Sixth Sem Percentage is: "+percentage+" %");
	}
	
	void sevent_sem(){
		int a,b,c,d,e,f,g,h;
		int ca=3,cb=3,cc=3,cd=3,ce=3,cf=2,cg=2,ch=1;
		double ga = 0,gb=0,gc=0,gd=0,ge=0,gf=0,gg=0,gh=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 18XX71:");
		a=s.nextInt();
		
		if(a<40) {
			
			ga=0;
		}
	else if(a>=45&&a<60) {
		ga=6;
	}

	else if(a>=40&&a<45) {
		ga=4;
	}

	else if(a>=60&&a<100) {
		ga=Math.ceil(a/10+1);
	}
		
		System.out.println(ga);
		
		System.out.println("Enter 18XX72:");
	b=s.nextInt();

	if(b<40) {

	gb=0;
	}
	else if(b>=45&&b<60) {
	gb=6;
	}

	else if(b>=40&&b<45) {
	gb=4;
	}

	else if(b>=60&&b<100) {
	gb=Math.ceil(b/10+1);
	}

	System.out.println(gb);

	System.out.println("Enter 18XX73X-Elective:");
	c=s.nextInt();

	if(c<40) {

	gc=0;
	}
	else if(c>=45&&c<60) {
	gc=6;
	}

	else if(c>=40&&c<45) {
	gc=4;
	}

	else if(c>=60&&c<100) {
	gc=Math.ceil(c/10+1);
	}

	System.out.println(gc);

	System.out.println("Enter 18XX74X-Elective:");
	d=s.nextInt();

	if(d<40) {

	gd=0;
	}
	else if(d>=45&&d<60) {
	gd=6;
	}

	else if(d>=40&&d<45) {
	gd=4;
	}

	else if(d>=60&&d<100) {
	gd=Math.ceil(d/10+1);
	}

	System.out.println(gd);

	System.out.println("Enter 18XX75X-Elective:");
	e=s.nextInt();

	if(e<40) {

	ge=0;
	}
	else if(e>=45&&e<60) {
	ge=6;
	}

	else if(e>=40&&e<45) {
	ge=4;
	}

	else if(e>=60&&e<100) {
	ge=Math.ceil(e/10+1);
	}

	System.out.println(ge);

	System.out.println("Enter 18XXL76-Lab-1:");
	f=s.nextInt();

	if(f<40) {

	gf=0;
	}
	else if(f>=45&&f<60) {
	gf=6;
	}

	else if(f>=40&&f<45) {
	gf=4;
	}

	else if(f>=60&&f<100) {
	gf=Math.ceil(f/10+1);
	}

	System.out.println(gf);

	System.out.println("Enter 18XXL77-Lab-2:");
	g=s.nextInt();

	if(g<40) {

	gg=0;
	}
	else if(g>=45&&g<60) {
	gg=6;
	}

	else if(g>=40&&g<45) {
	gg=4;
	}

	else if(g>=60&&g<100) {
	gg=Math.ceil(g/10+1);
	}

	System.out.println(gg);

	System.out.println("Enter 18XXP78-Project Phase-1:");
	h=s.nextInt();

	if(h<40) {

	gh=0;
	}
	else if(h>=45&&h<60) {
	gh=6;
	}

	else if(h>=40&&h<45) {
	gh=4;
	}

	else if(h>=60&&h<100) {
	gh=Math.ceil(h/10+1);
	}

	System.out.println(gh);


	double sgpa=((ga*ca)+(gb*cb)+(gc*cc)+(gd*cd)+(ge*ce)+(gf*cf)+(gg*cg)+(gh*ch))/20;

	double percentage=(sgpa-0.75)*10;
	System.out.println("Seventh Sem SGPA is : "+sgpa);
	System.out.println("Seventh Sem Percentage is: "+percentage+" %");
	}
	
	
void eighth_sem()
{
  int a,b,c,d,e;
  double ga=0,gb=0,gc=0,gd=0,ge=0;
  int ca=3,cb=3,cc=8,cd=1,ce=3;
  
	Scanner s=new Scanner(System.in);
  System.out.println("Enter a:");
  a=s.nextInt();
  
  if(a<40) {

		ga=0;
		}
		else if(a>=45&&a<60) {
		ga=6;
		}

		else if(a>=40&&a<45) {
		ga=4;
		}

		else if(a>=60&&a<100) {
		ga=Math.ceil(a/10+1);
		}

		System.out.println(ga);
		  b=s.nextInt();

		
		if(b<40) {

			gb=0;
			}
			else if(b>=45&&b<60) {
			gb=6;
			}

			else if(b>=40&&b<45) {
			gb=4;
			}

			else if(b>=60&&b<100) {
			gb=Math.ceil(b/10+1);
			}

			System.out.println(gb);
			
			c=s.nextInt();
			
			if(c<40) {

				gc=0;
				}
				else if(c>=45&&c<60) {
				gc=6;
				}

				else if(c>=40&&c<45) {
				gc=4;
				}

				else if(c>=60&&c<100) {
				gc=Math.ceil(c/10+1);
				}

				System.out.println(gc);

				System.out.println("Enter 18XX84X-Elective:");
				d=s.nextInt();

				if(d<40) {

				gd=0;
				}
				else if(d>=45&&d<60) {
				gd=6;
				}

				else if(d>=40&&d<45) {
				gd=4;
				}

				else if(d>=60&&d<100) {
				gd=Math.ceil(d/10+1);
				}

				System.out.println(gd);

				System.out.println("Enter 18XX84X-Elective:");
				e=s.nextInt();

				if(e<40) {

				ge=0;
				}
				else if(e>=45&&e<60) {
				ge=6;
				}

				else if(e>=40&&e<45) {
				ge=4;
				}

				else if(e>=60&&e<100) {
				ge=Math.ceil(e/10+1);
				}

				System.out.println(ge);
				
				
				double sgpa=((ga*ca)+(gb*cb)+(gc*cc)+(gd*cd)+(ge*ce))/18;

				double percentage=(sgpa-0.75)*10;
				System.out.println("Eighth Sem SGPA is : "+sgpa);
				System.out.println("Eighth Sem Percentage is: "+percentage+" %");
		
		
  
}

void cgpa() {
	
	double a,b,c,d,e,f,g,h,result,percentage;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter 1st sem sgpa:\n");
	a=s.nextDouble();
	
	System.out.println("Enter 2nd sem sgpa:\n");
	b=s.nextDouble();
	
	System.out.println("Enter 3rd sem sgpa:\n");
	c=s.nextDouble();
	
	System.out.println("Enter 4th sem sgpa:\n");
	d=s.nextDouble();
	
	System.out.println("Enter 5th sem sgpa:\n");
	e=s.nextDouble();
	
	System.out.println("Enter 6th sem sgpa:\n");
	f=s.nextDouble();
	
	System.out.println("Enter 7th sem sgpa:\n");
	g=s.nextDouble();
	
	System.out.println("Enter 8th sem sgpa:\n");
	h=s.nextDouble();
	
	 result=((a+b+c+d+e+f+g+h)/8);
	
	percentage=(result-0.75)*10;
	
	System.out.println("Your overall cgpa is: "+result);
	System.out.println("Your Percentage is : "+percentage +"%");

	
}

}

public class project{
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	

System.out.println("Enter 1 for physics cycle:");
System.out.println("Enter 2 for chemistry cycle:");
System.out.println("Enter 3 for 3rd sem / 4th sem:");
System.out.println("Enter 5 for 5th sem:");
System.out.println("Enter 6 for 6th sem:");
System.out.println("Enter 7 for 7th sem:");
System.out.println("Enter 8 for 8th sem:\n");
System.out.println("Enter 9 for cgpa calculation:\n");

System.out.println("Enter your choice:");

int num=scan.nextInt();
sgpa S=new sgpa();

switch(num) {
case 1:S.physics_cycle();break;
case 2:S.chemistry_cycle();break;
case 3:S.third_sem_or_fouth_sem();break;
case 5:S.fifth_sem();break;
case 6:S.sixth_sem();break;
case 7:S.sevent_sem();break;
case 8:S.eighth_sem();break;
case 9:S.cgpa();break;

}

}
}