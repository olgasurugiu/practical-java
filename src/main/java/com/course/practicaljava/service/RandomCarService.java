package com.course.practicaljava.service;

import org.springframework.stereotype.Service;

import com.course.practicaljava.entity.Car;

import io.netty.util.internal.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

	@Override
	public Car generateCar() {
		var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
		var color = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
		var type = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
		
		return new Car(brand, color, type);
	}

}
