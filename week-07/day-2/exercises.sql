show tables;

select title from movie where director = "Steven Spielberg";

select * from movie;
select * from rating;
select * from reviewer;

select distinct(m.year) from movie m inner join rating r on m.mID = r.mID where r.stars in (4,5)
order by year;

select m.title from movie m left join rating r on m.mID = r.mID where r.stars is null;

select distinct re.name from reviewer re left join rating r on re.rID = r.rID
where ratingDate is null;

select re.name, m.title, r.stars, r.ratingDate from movie m
inner join rating r on m.mID = r.mID
inner join reviewer re on re.rID = r.rID
order by re.name, m.title, r.stars;

/*For all cases where the same reviewer rated the same movie twice and gave it a higher rating the second time, return the reviewer’s name and the title of the movie.*/
select t.*, t2.stars first_stars, t3.stars last_stars
from /*get first and last seen of each rater and movie*/
(
select re.name, m. title, min(r.ratingDate) first_seen, max(r.ratingDate) last_seen from movie m
inner join rating r on m.mID = r.mID
inner join reviewer re on re.rID = r.rID
where r.ratingDate is not null
group by re.name, m. title
) t
inner join /*add first seen rating*/
(
select re.name, m.title, r.stars, r.ratingDate from movie m
inner join rating r on m.mID = r.mID
inner join reviewer re on re.rID = r.rID
order by re.name, m.title, r.ratingDate
) t2
on t.name = t2.name
and t.title = t2.title
and t.first_seen = t2.ratingDate
inner join /*add last seen rating*/
(
select re.name, m.title, r.stars, r.ratingDate from movie m
inner join rating r on m.mID = r.mID
inner join reviewer re on re.rID = r.rID
order by re.name, m.title, r.ratingDate
) t3
on t.name = t3.name
and t.title = t3.title
and t.last_seen = t3.ratingDate

where first_seen != last_seen
and t3.stars > t2.stars;

/*short version of the same*/

select re.name, m.title
from reviewer re
inner join rating r1 on re.rID = r1.rID
inner join rating r2 on r2.rID = re.rID
inner join movie m on  m.mid = r1.mid
where r1.mid = r2.mid
and r1.ratingdate < r2.ratingdate
and r1.stars < r2.stars;

select m.title, max(r.stars) from movie m inner join rating r on m.mid = r.mid
group by m.title
order by m.title;

select m.title, max(r.stars) - min(r.stars) rating_spread from movie m inner join rating r on m.mid = r.mid
group by m.title
order by max(r.stars) - min(r.stars) desc;

select t.age_group, avg(t.avg_stars)
from (
select m.title, case when m.year < 1980 then "old movies" else "new movies" end as age_group,
avg(r.stars) avg_stars from movie m inner join rating r on m.mid = r.mid
group by m.title,
case when m.year < 1980 then "old movies" else "new movies" end
order by m.title) t
group by t.age_group;















