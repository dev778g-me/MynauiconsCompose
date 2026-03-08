package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CigaretteOff: ImageVector
    get() {
        if (_CigaretteOff != null) {
            return _CigaretteOff!!
        }
        _CigaretteOff = ImageVector.Builder(
            name = "Filled.CigaretteOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.627f, 8.492f)
                curveTo(2.423f, 8.95f, 2.25f, 9.47f, 2.25f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.22f, 0.077f, -0.513f, 0.248f, -0.898f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.653f, -1.23f)
                lineToRelative(0.011f, -0.019f)
                curveToRelative(0.243f, -0.425f, 0.508f, -0.889f, 0.711f, -1.345f)
                curveToRelative(0.204f, -0.458f, 0.377f, -0.978f, 0.377f, -1.508f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                curveToRelative(0f, 0.22f, -0.077f, 0.513f, -0.248f, 0.898f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.653f, 1.23f)
                lineToRelative(-0.011f, 0.019f)
                curveToRelative(-0.243f, 0.425f, -0.508f, 0.889f, -0.711f, 1.345f)
                moveToRelative(3.5f, 0f)
                curveTo(5.923f, 8.95f, 5.75f, 9.47f, 5.75f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.22f, 0.077f, -0.513f, 0.248f, -0.898f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.653f, -1.23f)
                lineToRelative(0.011f, -0.019f)
                curveToRelative(0.243f, -0.425f, 0.508f, -0.889f, 0.711f, -1.345f)
                curveToRelative(0.204f, -0.458f, 0.377f, -0.978f, 0.377f, -1.508f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                curveToRelative(0f, 0.22f, -0.077f, 0.513f, -0.248f, 0.898f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.653f, 1.23f)
                lineToRelative(-0.011f, 0.019f)
                curveToRelative(-0.243f, 0.425f, -0.508f, 0.889f, -0.711f, 1.345f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 16f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17.75f)
                lineTo(7.31f, 17.75f)
                lineToRelative(-3.78f, 3.78f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(2.72f, -2.72f)
                lineTo(4f, 17.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(6.69f)
                lineToRelative(9.78f, -9.78f)
                lineToRelative(0.056f, -0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.056f, 1.056f)
                lineToRelative(-0.052f, 0.056f)
                lineToRelative(-8.72f, 8.72f)
                lineTo(20f, 12.25f)
                curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
                close()
                moveTo(20.25f, 14f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -0.25f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(2.5f)
                lineTo(20f, 16.25f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -0.25f)
                close()
            }
        }.build()

        return _CigaretteOff!!
    }

@Suppress("ObjectPropertyName")
private var _CigaretteOff: ImageVector? = null
