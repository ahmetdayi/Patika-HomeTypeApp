package com.ahmetdayi.hometypeapp;

import com.ahmetdayi.hometypeapp.entity.request.CreateHomeRequest;
import com.ahmetdayi.hometypeapp.entity.request.CreateSummerHouseRequest;
import com.ahmetdayi.hometypeapp.entity.request.CreateVillaRequest;
import com.ahmetdayi.hometypeapp.service.BaseHomeService;
import com.ahmetdayi.hometypeapp.service.HomeService;
import com.ahmetdayi.hometypeapp.service.SummerHouseService;
import com.ahmetdayi.hometypeapp.service.VillaService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@RequiredArgsConstructor
public class HomeTypeAppApplication implements CommandLineRunner {

	private final BaseHomeService baseHomeService;

	private final HomeService homeService;

	private final SummerHouseService summerHouseService;

	private final VillaService villaService;

	public static void main(String[] args) {
		SpringApplication.run(HomeTypeAppApplication.class, args);
	}

	@Override
	public void run(String... args)  {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Home Types are Created");
		System.out.println();



		//Home Create
		CreateHomeRequest createHomeRequest = new CreateHomeRequest(100,50,1,1);
		System.out.println(homeService.create(createHomeRequest));
		CreateHomeRequest createHomeRequest1 = new CreateHomeRequest(200,100,2,2);
		System.out.println(homeService.create(createHomeRequest1));
		CreateHomeRequest createHomeRequest2 = new CreateHomeRequest(300,150,3,4);
		System.out.println(homeService.create(createHomeRequest2));
		CreateHomeRequest createHomeRequest3 = new CreateHomeRequest(400,200,4,3);
		System.out.println(homeService.create(createHomeRequest3));


		//SummerHouse Create
		CreateSummerHouseRequest createSummerHouseRequest = new CreateSummerHouseRequest
				(
						100,
						50,
						1,
						1
				);
		System.out.println(summerHouseService.create(createSummerHouseRequest));
		CreateSummerHouseRequest createSummerHouseRequest1 = new CreateSummerHouseRequest
				(
						200,
						70,
						2,
						2
				);
		System.out.println(summerHouseService.create(createSummerHouseRequest1));
		CreateSummerHouseRequest createSummerHouseRequest2 = new CreateSummerHouseRequest
				(
						300,
						90,
						3,
						3
				);
		System.out.println(summerHouseService.create(createSummerHouseRequest2));
		CreateSummerHouseRequest createSummerHouseRequest3 = new CreateSummerHouseRequest
				(
						400,
						110,
						4,
						4
				);
		System.out.println(summerHouseService.create(createSummerHouseRequest3));


		//Villa Create
		CreateVillaRequest createVillaRequest = new CreateVillaRequest(100,50,1,1);
		System.out.println(villaService.create(createVillaRequest));
		CreateVillaRequest createVillaRequest1 = new CreateVillaRequest(120,60,1,1);
		System.out.println(villaService.create(createVillaRequest1));
		CreateVillaRequest createVillaRequest2 = new CreateVillaRequest(130,70,1,3);
		System.out.println(villaService.create(createVillaRequest2));
		CreateVillaRequest createVillaRequest3 = new CreateVillaRequest(140,80,1,2);
		System.out.println(villaService.create(createVillaRequest3));
		System.out.println();

		System.out.println("Home Types Created");

		System.out.println("---------------------------------------------------------");
		System.out.println("Sum Of Home Price");
		System.out.println(homeService.sumOfHomePrice());
		System.out.println("Sum Of SummerHouse Price");
		System.out.println(summerHouseService.sumOfSummerHousePrice());
		System.out.println("Sum Of Villa Price");
		System.out.println(villaService.sumOfVillaPrice());
		System.out.println("---------------------------------------------------------");


		System.out.println("Average Home Size");
		System.out.println(homeService.averageHomeSize());
		System.out.println("Average SummerHouse Size");
		System.out.println(summerHouseService.averageSummerHouseSize());
		System.out.println("Average Villa Size");
		System.out.println(villaService.averageVillaSize());
		System.out.println("---------------------------------------------------------");


		System.out.println("Average All Home Size");
		System.out.println(baseHomeService.averageAllHomeSize());
		System.out.println("---------------------------------------------------------");


		System.out.println("Sum Of All Home Price");
		System.out.println(baseHomeService.sumOfAllHomePrice());
		System.out.println("---------------------------------------------------------");


		System.out.print("Filter By Room Count And Living room Count");
		System.out.println(" (Room Count = 1,living Room = 1)");
		System.out.println();
		baseHomeService.filterByRoomCountAndLivingRoomCount(1,1).forEach(System.out::println);






	}
}
