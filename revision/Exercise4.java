package revision;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an umbrella";
		
		String largest = " ";
		String smallest = " ";
		String arr[] = str.split(" ");
		/*for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);*/
		int large=arr[0].length();
		int small=arr[0].length();
		for(int i=1;i<arr.length;i++) {
			if(arr[i].length() >= large) {
				//large = arr[i].length();
				largest = arr[i];
			}
		}
		System.out.println("Largest string : "+largest);
		for(int i=1;i<arr.length;i++) {
			if(arr[i].length() <= small) {
				//small = arr[i].length();
				smallest = arr[i];
			}
		}
		System.out.println("Smallest string : "+smallest);
			
	}

	}


