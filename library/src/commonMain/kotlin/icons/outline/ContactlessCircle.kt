package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ContactlessCircle: ImageVector
    get() {
        if (_ContactlessCircle != null) {
            return _ContactlessCircle!!
        }
        _ContactlessCircle = ImageVector.Builder(
            name = "Outline.ContactlessCircle",
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
                moveTo(8f, 9.99f)
                curveToRelative(0.147f, 0.646f, 0.225f, 1.319f, 0.225f, 2.01f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14.01f)
                moveToRelative(2.975f, -5.59f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 3.58f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 3.58f)
                moveToRelative(3.25f, -8.72f)
                curveToRelative(0.513f, 1.621f, 0.79f, 3.348f, 0.79f, 5.14f)
                reflectiveCurveToRelative(-0.277f, 3.519f, -0.79f, 5.14f)
            }
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
        }.build()

        return _ContactlessCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ContactlessCircle: ImageVector? = null
