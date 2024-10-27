function verifCode(code){
    if (code.length === 5){
        if(!isNaN(code) && code>1000 && code<99999){
            return true;
        }
    }else{
        return false;
    }
}