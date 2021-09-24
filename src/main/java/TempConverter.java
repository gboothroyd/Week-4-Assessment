
/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Sep 21, 2021
 */
public class TempConverter {
private double temp;
private double fTemp;
private double cTemp;


	public TempConverter() {
		// TODO Auto-generated constructor stub
	}
	
	


	/**
	 * @param temp
	 */
	public TempConverter(double temp) {
		super();
		this.temp = temp;
		setTempF();
		setTempC();
		
	}
	
	




	/**
	 * @return the temp
	 */
	public double getTemp() {
		return temp;
	}




	/**
	 * @param temp the temp to set
	 */
	public void setTemp(double temp) {
		this.temp = temp;
		setTempF();
		setTempC();
	}




	/**
	 * @return the fTemp
	 */
	public double getfTemp() {
		return fTemp;
	}


	/**
	 * @param fTemp the fTemp to set
	 */
	public void setfTemp(double fTemp) {
		
		this.fTemp = fTemp;
		
	}


	/**
	 * @return the cTemp
	 */
	public double getcTemp() {
		return cTemp;
	}


	/**
	 * @param cTemp the cTemp to set
	 */
	public void setcTemp(double cTemp) {
		this.cTemp = cTemp;
		
	}
	
	
	
	public void setTempF() {
		setfTemp(temp * 1.8 + 32);
		
	}
	
	public void setTempC() {
		setcTemp(((temp -32) * 5) / 9);
	}




	@Override
	public String toString() {
		return "TempConverter [temp=" + temp + ", fTemp=" + fTemp + ", cTemp=" + cTemp + "]";
	}
	
	
	

}
