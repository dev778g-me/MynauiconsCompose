package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SearchCircle: ImageVector
    get() {
        if (_SearchCircle != null) {
            return _SearchCircle!!
        }
        _SearchCircle = ImageVector.Builder(
            name = "Outline.SearchCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
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

        return _SearchCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SearchCircle: ImageVector? = null
