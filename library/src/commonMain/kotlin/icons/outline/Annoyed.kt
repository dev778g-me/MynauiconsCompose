package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Annoyed: ImageVector
    get() {
        if (_Annoyed != null) {
            return _Annoyed!!
        }
        _Annoyed = ImageVector.Builder(
            name = "Outline.Annoyed",
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
                moveTo(9f, 15.5f)
                horizontalLineToRelative(6f)
                moveToRelative(-5f, -5.25f)
                horizontalLineTo(9f)
                moveToRelative(6f, 0f)
                horizontalLineToRelative(-1f)
            }
        }.build()

        return _Annoyed!!
    }

@Suppress("ObjectPropertyName")
private var _Annoyed: ImageVector? = null
