package pl.eninja;

class firstDuplicate {

    int findUsingFor(int[] a) {
        int result = -1;
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;
                    if (counter <= a[j]) {
                        result = a[i];
                    }
                }
            }
        }

        return result;

    }

}


// int counter = 0;
//    int temp = -1;
//    for(int i = 0; i < a.length; i++){
//        for(int j = i + 1; j < a.length; j++){
//            if(a[i] == a[j] ){
//                counter++;
//                    if(counter <= a[j]){
//                        temp = a[i];
//                    }
//            }else
//                temp = temp;
//        }
//    }
//    return temp;}