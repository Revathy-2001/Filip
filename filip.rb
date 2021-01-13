a,b= gets.chomp.split.map(&:to_i)
l1 = a.to_s.length
l2 = b.to_s.length
if(l1 && l2 == 3)
  a = a.to_s.reverse.to_i
  b = b.to_s.reverse.to_i
  if(a > b)
    print(a)
  else
    print(b)
  end
end