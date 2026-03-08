package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Wheel: ImageVector
    get() {
        if (_Wheel != null) {
            return _Wheel!!
        }
        _Wheel = ImageVector.Builder(
            name = "Outline.Wheel",
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
                moveTo(19.794f, 16.5f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 19.794f)
                moveTo(19.794f, 16.5f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 4.206f)
                moveTo(19.794f, 16.5f)
                lineTo(13.732f, 13f)
                moveTo(7.5f, 19.794f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.206f, 7.5f)
                moveTo(7.5f, 19.794f)
                lineToRelative(3.5f, -6.062f)
                moveTo(4.206f, 7.5f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 4.206f)
                moveTo(4.206f, 7.5f)
                lineToRelative(6.062f, 3.5f)
                moveTo(16.5f, 4.206f)
                lineTo(13f, 10.268f)
                moveTo(13.732f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.732f, 0.732f)
                moveTo(13.732f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 10.268f)
                moveToRelative(-2f, 3.464f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.268f, 11f)
                moveToRelative(0f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10.268f)
                moveToRelative(0.932f, 1.214f)
                lineToRelative(6.761f, -1.811f)
                moveToRelative(-8.175f, 4.26f)
                lineToRelative(1.811f, 6.762f)
                moveToRelative(-4.26f, -8.175f)
                lineToRelative(-6.762f, 1.811f)
                moveToRelative(8.175f, -4.26f)
                lineTo(9.671f, 3.306f)
            }
        }.build()

        return _Wheel!!
    }

@Suppress("ObjectPropertyName")
private var _Wheel: ImageVector? = null
