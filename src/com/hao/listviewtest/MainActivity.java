package com.hao.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.hao.listviewtest.R;

public class MainActivity extends Activity {

	// private String[] data = { "Apple", "Banana", "Orange", "Watermelon",
	// "Pear", "Grape", "Pineapple", "Strawberry", "Cherry",
	// "Mango","sadi","sada","asdadw","hduwndu" };

	private List<Fruit> FruitList = new ArrayList<Fruit>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		initFruits();
		FruitAdapter adapter = new FruitAdapter(MainActivity.this,
				R.layout.fruit_item, FruitList);
		// ArrayAdapter<String> adapter = new ArrayAdapter<String>(
		// MainActivity.this, android.R.layout.simple_list_item_1, data);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
	}

	private void initFruits() {
		Fruit apple = new Fruit("apple", R.drawable.apple_pic);
		FruitList.add(apple);
		Fruit boluo = new Fruit("boluo", R.drawable.boluo_pic);
		FruitList.add(boluo);
		Fruit caomei_1 = new Fruit("caomei_1", R.drawable.caomei_one_pic);
		FruitList.add(caomei_1);
		Fruit caomei_2 = new Fruit("caomei_2", R.drawable.caomei_three_pic);
		FruitList.add(caomei_2);
		Fruit caomei = new Fruit("caomei", R.drawable.caomei_pic);
		FruitList.add(caomei);
		Fruit jvzi = new Fruit("jvzi", R.drawable.jvzi_pic);
		FruitList.add(jvzi);
		Fruit li = new Fruit("li", R.drawable.li_pic);
		FruitList.add(li);
		Fruit pear = new Fruit("pear", R.drawable.pear_pic);
		FruitList.add(pear);
		Fruit pingguo = new Fruit("pingguo", R.drawable.pingguo_pic);
		FruitList.add(pingguo);
		Fruit xihongshi = new Fruit("xihongshi", R.drawable.xihongshi_pic);
		FruitList.add(xihongshi);
	}

}
