package edu.hm.cs.pblv.group3.model.response.objects;

/**
 * @author Konstantin on 20.09.2018.
 */
public class Context {

	private String name;
	private static final int lifespanCount = 5;

	public Context(String session) {
		this.name = session + "/contexts/context_back_to_start";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getLifespanCount() {
		return lifespanCount;
	}
}
