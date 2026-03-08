package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SearchDiamond: ImageVector
    get() {
        if (_SearchDiamond != null) {
            return _SearchDiamond!!
        }
        _SearchDiamond = ImageVector.Builder(
            name = "Outline.SearchDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.856f, 13.85f)
                arcToRelative(3.429f, 3.429f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.855f, -4.842f)
                arcToRelative(3.429f, 3.429f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.855f, 4.842f)
                moveToRelative(0f, 0f)
                lineTo(16f, 16f)
            }
        }.build()

        return _SearchDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _SearchDiamond: ImageVector? = null
