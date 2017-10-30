<?php

function mdc($v1, $v2) {
	$a = max($v1, $v2);
	$b = min($v1, $v2);

	if ($a%$b == 0)
	{
		return $b;
	} else {
		return mdc($a, ($a%$b));
	}
}

function mmc($v1, $v2) {
	return (($v1 * $v2) / mdc($v1, $v2));
}

function fraction_sum($num1, $den1, $num2, $den2) {
	$mmc = mmc($den1, $den2);

	$num_frac1 = ($mmc / $den1) * $num1;
	$num_frac2 = ($mmc / $den2) * $num2;

	$sum = $num_frac1 + $num_frac2;

	$mdc = mdc($sum, $mmc);

	if ($mdc == 1) {
		echo $num1.' / '.$den1.' + '.$num2.' / '.$den2.' = '.$sum.' / '.$mmc;
	} else {
		echo $num1.' / '.$den1.' + '.$num2.' / '.$den2.' = '.($soma / $mdc).' / '.($mmc / $mdc);
	}
}