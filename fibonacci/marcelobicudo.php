<?php 

function fibonacci($n){
	if($n >= 2){ 
		$f = [1,1]; 
		for($i = 2; $i < $n; $i++){
			$f[$i] = $f[$i-1] + $f[$i-2];		
		}
		return $f;
	} else if ($n == 1)	{
		return [1];
	} else {
		return [];
	}	
}

?>