package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Haze: ImageVector
    get() {
        if (_Haze != null) {
            return _Haze!!
        }
        _Haze = ImageVector.Builder(
            name = "Outline.Haze",
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
                moveTo(15.5f, 13f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7f, 0f)
                moveTo(12f, 3.5f)
                verticalLineToRelative(2f)
                moveTo(5.898f, 6.898f)
                lineToRelative(1.278f, 1.278f)
                moveTo(3f, 12.9f)
                horizontalLineToRelative(1.8f)
                moveToRelative(14.2f, 0f)
                horizontalLineToRelative(1.8f)
                moveToRelative(-4.176f, -4.724f)
                lineToRelative(1.278f, -1.278f)
                moveTo(21f, 17f)
                horizontalLineTo(3f)
                moveToRelative(18f, 3.5f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Haze!!
    }

@Suppress("ObjectPropertyName")
private var _Haze: ImageVector? = null
