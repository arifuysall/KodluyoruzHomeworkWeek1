package weekone.homework3;

import java.time.LocalDate;

public class PersonalData {
	public LocalDate birthdate;
	private String address;
	private long ssn;
	
	public PersonalData(LocalDate birthdate, long ssn) {
		super();
		this.birthdate = birthdate;
		this.ssn = ssn;
	}
	public PersonalData(int year,int month,int day, long ssn  ) {
		super();
		this.ssn = ssn;
		this.birthdate = LocalDate.of(year,month,day);

	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSsn() {
		return ssn;
	}
	@Override
	public String toString() {
		return "PersonalData: Birthdate = " + birthdate + ", Address = " + address + ", Social Security Number = " + ssn;
	}
}
