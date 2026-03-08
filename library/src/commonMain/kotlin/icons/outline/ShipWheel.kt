package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShipWheel: ImageVector
    get() {
        if (_ShipWheel != null) {
            return _ShipWheel!!
        }
        _ShipWheel = ImageVector.Builder(
            name = "Outline.ShipWheel",
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
                moveToRelative(15.728f, 3f)
                lineToRelative(-2.796f, 6.75f)
                moveToRelative(0f, 0f)
                lineToRelative(1.32f, 1.317f)
                moveToRelative(-1.32f, -1.317f)
                lineToRelative(-1.865f, -0.003f)
                moveTo(20.91f, 8.31f)
                lineToRelative(-1.71f, 0.708f)
                moveToRelative(-4.947f, 2.049f)
                lineToRelative(4.947f, -2.05f)
                moveToRelative(-4.947f, 2.05f)
                lineToRelative(-0.003f, 1.865f)
                moveTo(21f, 15.728f)
                lineToRelative(-6.75f, -2.796f)
                moveToRelative(0f, 0f)
                lineToRelative(-1.317f, 1.32f)
                moveToRelative(2.758f, 6.658f)
                lineToRelative(-0.709f, -1.71f)
                moveToRelative(-2.049f, -4.947f)
                lineToRelative(2.05f, 4.947f)
                moveToRelative(-2.05f, -4.947f)
                lineToRelative(-1.865f, -0.003f)
                moveToRelative(0f, 0f)
                lineTo(8.272f, 21f)
                moveToRelative(2.796f, -6.75f)
                lineToRelative(-1.32f, -1.317f)
                moveToRelative(0f, 0f)
                lineTo(4.8f, 14.983f)
                moveToRelative(4.947f, -2.05f)
                lineToRelative(0.003f, -1.865f)
                moveToRelative(-6.66f, 4.623f)
                lineToRelative(1.71f, -0.709f)
                moveToRelative(4.95f, -3.914f)
                lineTo(3f, 8.272f)
                moveToRelative(6.75f, 2.796f)
                lineToRelative(1.317f, -1.32f)
                moveToRelative(0f, 0f)
                lineTo(9.017f, 4.8f)
                moveTo(8.31f, 3.09f)
                lineToRelative(0.708f, 1.71f)
                moveToRelative(0f, 0f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.8f, 9.018f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.964f)
                moveTo(9.018f, 4.8f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.964f, 0f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.2f, 9.018f)
                moveToRelative(0f, 0f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.964f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.218f, 4.218f)
                moveToRelative(0f, 0f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.964f, 0f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 14.982f)
            }
        }.build()

        return _ShipWheel!!
    }

@Suppress("ObjectPropertyName")
private var _ShipWheel: ImageVector? = null
