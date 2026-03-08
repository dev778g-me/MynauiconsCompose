package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Eye: ImageVector
    get() {
        if (_Eye != null) {
            return _Eye!!
        }
        _Eye = ImageVector.Builder(
            name = "Outline.Eye",
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
                moveTo(2.55f, 13.406f)
                curveToRelative(-0.272f, -0.373f, -0.408f, -0.56f, -0.502f, -0.92f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.971f)
                curveToRelative(0.094f, -0.361f, 0.23f, -0.548f, 0.502f, -0.92f)
                curveTo(4.039f, 8.55f, 7.303f, 5f, 12f, 5f)
                reflectiveCurveToRelative(7.961f, 3.55f, 9.45f, 5.594f)
                curveToRelative(0.272f, 0.373f, 0.408f, 0.56f, 0.502f, 0.92f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.971f)
                curveToRelative(-0.094f, 0.361f, -0.23f, 0.548f, -0.502f, 0.92f)
                curveTo(19.961f, 15.45f, 16.697f, 19f, 12f, 19f)
                reflectiveCurveToRelative(-7.961f, -3.55f, -9.45f, -5.594f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
        }.build()

        return _Eye!!
    }

@Suppress("ObjectPropertyName")
private var _Eye: ImageVector? = null
