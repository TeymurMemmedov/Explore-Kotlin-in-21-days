fun findSum(nums:Array<Int>):Int {
    var sum = 0 
    for(i in nums) 
        sum+=i
    return sum
}

fun findMin(nums:Array<Int>):Int{
    var min = nums[0]
    for(i in nums)
        if(i<min) min = i
    return min;
}

fun findMax(nums:Array<Int>):Int{
    var max = nums[0]
    for(i in nums)
        if(i>max) max = i
    return max;
}


fun main(args: Array<String>) {
    val nums1:Array<Int> = arrayOf(1,3,5,7,9,11,13,15)
    val nums2:Array<Int> = arrayOf(2,4,6,8,10,12)
    //Sum,Maximum,Minimum    
    println("${findSum(nums1)} : ${findMin(nums1)} : ${findMax(nums1)}")
    println("${findSum(nums2)} : ${findMin(nums2)} : ${findMax(nums2)}")
}