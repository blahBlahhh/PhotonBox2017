package org.usfirst.frc.team6179.tools;

public class Vector3D {
	public double x;
	public double y;
	public double z;
	
	public Vector3D(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Vector3D floor(){
		return new Vector3D(Math.floor(x),Math.floor(y),Math.floor(z));
	}
	
	public Vector3D add(Vector3D v){
		return new Vector3D(x+v.x,y+v.y,z+v.z);
	}
	
	public Vector3D sub(Vector3D v){
		return new Vector3D(x-v.x,y-v.y,z-v.z);
	}
	
	public Vector3D mul(Vector3D v){
		return new Vector3D(x*v.x,y*v.y,z*v.z);
	}
	
	public Vector3D div(Vector3D v){
		return new Vector3D(x/v.x,y/v.y,z/v.z);
	}
	
	public Vector3D add(double d){
		return new Vector3D(x+d,y+d,z+d);
	}
	
	public Vector3D sub(double d){
		return new Vector3D(x-d,y-d,z-d);
	}
	
	public Vector3D mul(double d){
		return new Vector3D(x*d,y*d,z*d);
	}
	
	public Vector3D div(double d){
		return new Vector3D(x/d,y/d,z/d);
	}
	
	public double mod(){
		return Math.sqrt(x*x+y*y+z*z);
	}
	
}
