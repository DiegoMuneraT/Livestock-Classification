public class Subconjuntos
{
    public static boolean SumaGrupo(int[]nums,int target){
        return SumaGrupoBasico(0,nums,target);
    }

    private static boolean SumaGrupoBasico(int start,int[]nums,int target){
        System.out.println(start + " "+ target);
        if (start >= nums.length) {
            if (target == 0)
                return true;
            else
                return false;
        }else{ // start < nums.length
            boolean universo1 = SumaGrupoBasico(start + 1, nums, target - nums[start]);
            if (universo1)
                return true;
            else{
                boolean universo2 = SumaGrupoBasico(start + 1, nums, target);
                if (universo2)
                    return true;
                else
                    return false;
            }
        }
    }
}
