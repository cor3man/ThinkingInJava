package com.alis.rtti.typeinfo.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.alis.rtti.typeinfo.factory.Factory;

public abstract class FabricPatCreater {
    //инициализация генератора случайных чисел
private Random rand = new Random(47); 
    //абстрактный метод возвращает список возможных типов(классов) животных 
public abstract List<Factory<? extends Pet>> getTypes();
 
 
public Pet randomPet(){ // Создание одного случайного объекта Pet 
    // генерация случайного номера в диапазоне списка классов животных
    int n = rand.nextInt(getTypes().size());
    return getTypes().get(n).create();  
}
 
 
public Pet[] createArray(int size) {//создание массива случайных Pet 
    Pet[] result = new Pet[size];
    for (int i=0; i < size; i++)
        result[i] = randomPet();
    return result;
}
 
public ArrayList<Pet> arrayList(int size) {// создание списка случайных Pet
    ArrayList<Pet> result = new ArrayList<Pet>();
    Collections.addAll(result, createArray(size));
    return result;
  }
}
