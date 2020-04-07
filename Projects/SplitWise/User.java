import java.util.*;
class User
{
	private String name;
	private String email_id;
	private String phone;
	private String user_id;
	public static int counter=1;
	User()
	{
		name=null;
		email_id=null;
		phone=null;
		user_id=null;
		counter++;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmailId(String email)
	{
		this.email_id=email;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public void setUserId(String uid)
	{
		this.user_id=uid;
	}

	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.name;
	}
	public String getUserId()
	{
		return this.user_id;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void input()
	{
		Random rand=new Random();
		String uid="u"+counter;
		String name="ABC"+counter;
		String phone="9787"+rand.nextInt(10)+"8976"+counter;
		String email=uid+"@xyz.com";
	}

}