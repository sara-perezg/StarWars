package com.swapi;


import java.io.Serializable;
import java.util.ArrayList;

/**
*
* @author Sara PG
* @param <T>
*/
public class SWAPIList<T> implements Serializable {
	
    private int count;
    private String next;
    private String previous;
    private ArrayList<T> results;

    
    public SWAPIList() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SWAPIList(int count, String next, String previous, ArrayList<T> results) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.results = results;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getNext() {
		return next;
	}


	public void setNext(String next) {
		this.next = next;
	}


	public String getPrevious() {
		return previous;
	}


	public void setPrevious(String previous) {
		this.previous = previous;
	}


	public ArrayList<T> getResults() {
		return results;
	}


	public void setResults(ArrayList<T> results) {
		this.results = results;
	}


	@Override
	public String toString() {
		return "SWModelList [count=" + count + ", next=" + next + ", previous=" + previous + ", results=" + results
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((previous == null) ? 0 : previous.hashCode());
		result = prime * result + ((results == null) ? 0 : results.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SWAPIList other = (SWAPIList) obj;
		if (count != other.count)
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		return true;
	}


//	public boolean hasMore() {
//        return (next != null && next.length() != 0);
//    }
}
