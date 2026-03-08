package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Indifferent: ImageVector
    get() {
        if (_Indifferent != null) {
            return _Indifferent!!
        }
        _Indifferent = ImageVector.Builder(
            name = "Outline.Indifferent",
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
                moveTo(9f, 15.5f)
                horizontalLineToRelative(6f)
                moveToRelative(-5.5f, -5f)
                verticalLineTo(10f)
                moveToRelative(5f, 0.5f)
                verticalLineTo(10f)
                moveToRelative(6.5f, 2f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
        }.build()

        return _Indifferent!!
    }

@Suppress("ObjectPropertyName")
private var _Indifferent: ImageVector? = null
