public static int sumOfAdjacentElements(List<Integer> arr) {
		while(arr.size()>2) {
			List<Integer> res = new ArrayList<>();
			if(arr.size()%2!=0) {
				for(int i = 0;i<arr.size()-2;i+=2) {
					res.add(arr.get(i)+arr.get(i+1));
				}
				res.add(arr.get(arr.size()-1));
			}else if(arr.size()%2==0) {
				for(int i = 0;i<arr.size()-1;i+=2) {
					res.add(arr.get(i)+arr.get(i+1));
				}
			}
			
			arr = res;
		}
		if(arr.size()>1) {
			return arr.get(0)*arr.get(0)+arr.get(1)*arr.get(1);
		}else {
			return arr.get(0)*arr.get(0);
		}
		
	}
