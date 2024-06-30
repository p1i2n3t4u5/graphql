query {
  getUserById(id:1){
    id
    userName
    emailId
  }
}
---------------------------------------
query {
  getPostById(id:10){
    id
    subject
    comments {
      id
      reply
    }
    user {
      id
      userName
      emailId
    }
  }
}
------------------------------------------
query {
  getPostById(id:10){
    id
    subject
    comments {
      id
      reply
     user{
      id
      userName
     }
    }
    user {
      id
      userName
      emailId
    }
  }
}
-------------------------------

query {
  getCommentById(id:101){
    id
    reply
  }
}
--------------------------------
query {
  getCommentById(id:101){
    id
    reply
    post{
      id
      subject
    }
    user{
      id
      userName
      emailId
    }
  }
}

