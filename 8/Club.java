public class Club {
    private Member [] members = new Member [20];
    private String clubMembers="";
    private int totalFees;

    public void addMember(Member member){
        if( members[members.length-1] != null ){
            clubMembers += String.format("Sorry %s, the club is full.\n", member.getName());
        }else{
            for(int i=0; i<members.length; i++){
                if( members[i] == null ){
                    members[i] = member;
                    clubMembers += members[i];
                    break;
                }
            }
        }
    }

    public int totalFees(){
        for(int i=0; i<members.length; i++){
            if( members[i] != null ){
                totalFees += members[i].getFee();
            }
        }
        return totalFees;
    }

    public String toString(){
        return clubMembers;
    }
}
