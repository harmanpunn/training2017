package com.sapient.dao;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.*;;

public class EmpMemDao implements IDao {

	public static Map<Integer, Emp> emap;
	static {
		emap = new HashMap<Integer, Emp>();
		emap.put(1001, new Emp(1001, "ram", 45000, 1, LocalDate.of(2015, 7, 21)));
		emap.put(1002, new Emp(1002, "tom", 50000, 1, LocalDate.of(2017, 9, 17)));
		emap.put(1003, new Emp(1003, "sam", 35000, 1, LocalDate.of(2013, 7, 13)));
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<Emp>();
		lst.addAll(emap.values());
		return lst;
	}

	@Override
	public Emp viewEmployee(int eid) throws NotFoundException {
		if (!emap.containsKey(eid))
			throw new NotFoundException("Employee Not Found");
		Emp emp = emap.get(eid);
		return emp;
	}

	@Override
	public int addEmployee(Emp emp) throws IdException {
		if (emap.containsKey(emp.getEmpId()))
			throw new IdException("Id Already Exists");
		emap.put(emp.getEmpId(), emp);
		return 1;
	}

	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		return 0;
	}

	@Override
	public int updateEmployee(int eid, double sal) throws NotFoundException {
		return 0;
	}

}
