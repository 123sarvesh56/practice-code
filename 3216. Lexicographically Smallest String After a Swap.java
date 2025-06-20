class Solution {
public String getSmallestString(String s) {
	char[] a = s.toCharArray();
	int n = a.length, i=0;
	while(i < n-1) {
		int curr = a[i]-'0', next = a[i+1]-'0';
		boolean flag1 = curr%2==0, flag2 = next%2==0;
		if(flag1==flag2) {
			if(curr > next) {
				char temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				break;
			}
		}
		i++;
	}

	return new String(a);
}
}