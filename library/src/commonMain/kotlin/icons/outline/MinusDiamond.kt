package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MinusDiamond: ImageVector
    get() {
        if (_MinusDiamond != null) {
            return _MinusDiamond!!
        }
        _MinusDiamond = ImageVector.Builder(
            name = "Outline.MinusDiamond",
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
                moveTo(8.5f, 12f)
                horizontalLineToRelative(7f)
            }
        }.build()

        return _MinusDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _MinusDiamond: ImageVector? = null
