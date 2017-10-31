module.exports = {
  isPowerOf2 : function(x){
    return ( x && (!(x & (x - 1))));
  },
};
