package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.HashCircle: ImageVector
    get() {
        if (_HashCircle != null) {
            return _HashCircle!!
        }
        _HashCircle = ImageVector.Builder(
            name = "Outline.HashCircle",
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
                moveTo(10.905f, 8f)
                lineToRelative(-1.437f, 8f)
                moveToRelative(4.937f, -8f)
                lineToRelative(-1.437f, 8f)
                moveToRelative(3.314f, -5.75f)
                horizontalLineTo(7.718f)
                moveToRelative(8.564f, 3.5f)
                horizontalLineTo(7.718f)
            }
        }.build()

        return _HashCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HashCircle: ImageVector? = null
