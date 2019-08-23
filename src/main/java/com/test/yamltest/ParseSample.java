package com.test.yamltest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class ParseSample {

	public static void main(String args[]) {
		Constructor constructor = new Constructor(YamlConfig.class);
		Yaml yaml = new Yaml( constructor );

		InputStream input = null;
		try {
			input = new FileInputStream(new File("src/main/resources/app.yml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		YamlConfig data = yaml.loadAs( input, YamlConfig.class );
		System.out.println( data );
		System.out.println( yaml.dump( data ));
	}
}
