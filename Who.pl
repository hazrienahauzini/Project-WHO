#!usr/bin/perl
use strict;
use warnings;

my $out = qx(java WhoCommand);
print("$out");
