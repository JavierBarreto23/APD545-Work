/*Workshop # [1]
Course: [Subject #] - [Semester]
Last Name: [Barreto Lara]
First Name: [Javier]
ID: [172535221]
This assignment represents my own work in accordance
//with Seneca Academic Policy.
Date: [May 20, 2026]*/

package ca.senecacollege.controllers;
import ca.senecacollege.abstracts.Vehicle;

import java.util.Arrays;

public class vehicleController {
    public Vehicle[] sortVehiclesByPurchasePrice(Vehicle[] vehicles) {
        //iteration is gonna happen and im gonna use mergesort
        return mergeSort(vehicles);
    }

    public Vehicle[] mergeSort(Vehicle[] v){
        if (v.length <= 1){
            return v;
        }
        int mid = v.length/2;
        Vehicle[] left = mergeSort(Arrays.copyOfRange(v, 0, mid));
        Vehicle[] right = mergeSort(Arrays.copyOfRange(v, mid + 1, v.length));

        return merge(left,right);
    }

    public Vehicle[] merge(Vehicle[] left, Vehicle[] right){
        Vehicle[] mergedVehicles = new Vehicle[left.length + right.length];
        int i = 0;
        int j = 0;
        for(; i < left.length && j < right.length; i++){
            if(left[i].getPurchasePrice() > right[i].getPurchasePrice()){
                mergedVehicles[i] = left[i];
                i++;
            }else{
                mergedVehicles[i] = right[i];
                j++;
            }
        }
        while(i < left.length){
            mergedVehicles[i] = left[i];
            i++;
        }
        while(j < right.length){
            mergedVehicles[j] = right[j];
            j++;
        }
        return mergedVehicles;
    }
}
