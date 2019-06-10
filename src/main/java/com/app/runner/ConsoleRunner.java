package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		/**Option Arguments**/

		//1.Read all key names.
		Set<String> optionKeys=args.getOptionNames();
		System.out.println(optionKeys);

		//2.One Key Realated Value
		List<String> list=args.getOptionValues("profile");
		System.out.println(list);

		//3.Existence of key
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));

		/**NonOption Arguments**/

		List<String> lst =args.getNonOptionArgs();
		System.out.println(lst);

		/** Getiing All Type Arguments**/

		String[] arr=args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));

	}

}
