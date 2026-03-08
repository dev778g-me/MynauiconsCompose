package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.HashDiamond: ImageVector
    get() {
        if (_HashDiamond != null) {
            return _HashDiamond!!
        }
        _HashDiamond = ImageVector.Builder(
            name = "Outline.HashDiamond",
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

        return _HashDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _HashDiamond: ImageVector? = null
