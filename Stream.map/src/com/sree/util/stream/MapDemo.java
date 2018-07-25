package com.sree.util.stream;

import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();
		Stream<Player> players = list.stream().map(e -> new Player(e.id, e.name));
		players.forEach(p -> System.out.println(p.id + ", " + p.name  + ", " + p.sal));
		
		Stream<Player> players1 = list.stream().map(e -> new Player(e.id, e.name, e.sal));
		players1.forEach(p -> System.out.println(p.id + ", " + p.name  + ", " + p.sal));
	}

	static class Player {
		int id;
		String name;
		int sal;

		Player(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		Player(int id, String name, int sal) {
			this.id = id;
			this.name = name;
			this.sal=sal;
		}
	}
}