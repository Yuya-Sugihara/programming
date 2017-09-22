class Login{
  String[] idList={"tanaka","yamada"};
  String uid;

  public void getInfo(){
    uid=Input.getString("ユーザー名");
  }

  public boolean isUser(){
    for(int i=0;i<idList.length;i++){
      if(uid.equals(idList[i])){
        return true;
      }
    }
    return false;
  }
}
