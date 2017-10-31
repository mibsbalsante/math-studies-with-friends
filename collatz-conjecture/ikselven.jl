function collatz(number::Int)
    if number < 1
        println("Please use a number >= 1")
        return Array{Int, 1}([])
    end

    sequence = Array{Int, 1}([])
    while number > 1
        push!(sequence, number)
        if number % 2 == 0
            number ÷= 2
        else
            number = 3*number + 1
        end
    end
    push!(sequence, 1)
    return sequence
end
